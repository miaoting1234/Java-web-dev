package com.web;
import com.web.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/index")
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book[] books={
                new Book("汪曾祺全集","book1.jpg","汪曾祺"),
                new Book("想象一朵未来的玫瑰","book2.jpg","费尔南多"),
                new Book("建筑师","book3.jpg","大卫"),
                new Book("短篇小说全集","book4.jpg","库尔特·冯内古特"),
                new Book( "奥利弗","book5.jpg","伊丽莎白·斯特劳特"),
                new Book( "造景集","book6.jpg","玉山返款"),
                new Book( "奥斯特利茨","book7.jpg","赛巴尔德"),
                new Book( "论自由","book8.jpg","约翰"),
                new Book( "桃子手记","book9.jpg","桃子"),
                new Book( "弃业医生日志","book10.jpg","亚当"),
        };
        List<Book> bookList = Arrays.asList(books);
        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
