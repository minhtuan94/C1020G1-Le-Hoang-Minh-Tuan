package com.example.demo.controller;
import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping(value = {"","/list"})
    public ModelAndView studentList(@PageableDefault(value = 2) Pageable pageable){
        return new ModelAndView("/blog/list", "blogList", blogService.findAll(pageable));
    }


    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "/blog/create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("successMsg", "Create blog: "+blog.getTitle() +" success!");
        return "redirect:/blog";
//        return "forward:/student";
    }
    //
    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable int id, Model model){
        System.out.println(id);
        model.addAttribute("blog", blogService.findById(id));
        return "/blog/edit";
    }

    @PostMapping(value = "/edit")
    public String editStudent(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("successMsg", "Update blog: "+blog.getTitle() +" success!");
        return "redirect:/blog";
    }

    @GetMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 10)Pageable pageable){
        return new ModelAndView("/blog/list", "blogList", blogService.findByInputText(inputSearch, pageable));
    }
}