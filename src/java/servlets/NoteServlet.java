/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import models.Note;

/**
 *
 * @author 562187
 */
public class NoteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String edit;
        String title = br.readLine();
        String content = br.readLine();
        Note refreshedNote = new Note(title, content);
        request.setAttribute("refreshedNote", refreshedNote);
        
        br.close();
        
        edit = request.getParameter("edit");
        if (edit == null){
            request.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
        }
        else {
            request.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);
        }  
       
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        Note write = new Note(title, contents);
        
        pw.println(write.getTitle());
        pw.println(write.getContents());
        
        pw.close();
        
        request.setAttribute("refreshedNote", write);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        
   
    }


}
