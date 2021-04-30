package com.tangheng.controller;

import com.tangheng.pojo.Books;
import com.tangheng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = service.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String addBook(){
//        int s = service.addBook(book);
//        model.addAttribute("s", s);
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String add(Books books){
        service.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/update")
    public String update(Integer id,Model model){
        Books book = service.queryBookById(id);
        model.addAttribute("oldBook",book);
        return "update";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        service.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        service.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBookName")
    public String queryBooks(String bookName,Model model){
        Books books = service.queryBookByName(bookName);
        if(books==null){
            model.addAttribute("error","未查到");   //重定向会把作用域的值清除!!!
            return "allBook";
        }
        List<Books> list = new ArrayList<>();
        list.add(books);
        model.addAttribute("list",list);
        return "queryBooks";
    }

}
