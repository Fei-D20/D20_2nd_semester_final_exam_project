package com.DB.DaoImplement.eventcard;

import com.DB.Dao.eventcard.IF_CommentDao;
import com.DB.util.CRUD_Util;
import com.Domain.eventcard.Dom_Comment;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.DB.util.CRUD_Util.getTable;
import static com.DB.util.CRUD_Util.update;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-06-09.42
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Impl_CommentDao implements IF_CommentDao {
    @Override
    public void add(Dom_Comment dom_comment) {
        try {
            String sql = "INSERT INTO  tbl_Comment(fld_commentID, fld_commentTime, fld_commentText, fld_Author) values (?,?,?,?)";

            LocalDate localDate = dom_comment.getLocalDate();
            Date date = Date.valueOf(localDate);

            update(sql,dom_comment.getCommentID(),dom_comment.getLocalDate(),dom_comment.getCommentText(),dom_comment.getCommentAuthor());
            System.out.println("The Comment : " + dom_comment.getCommentText() + "   saved into database is successful ! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(Dom_Comment dom_comment) {
        try {
            String sql = "UPDATE tbl_Comment SET fld_CommentId = ?,fld_CommentTime = ? ,fld_Text = ? where fld_CommentAuthour = ?";
            update(sql,dom_comment.getCommentID(),dom_comment.getLocalDate(),dom_comment.getCommentText(),dom_comment.getCommentAuthor());
            System.out.println("update finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public void delete(Dom_Comment dom_comment) {
        try {
            String sql = "DELETE FROM tbl_Comment WHERE fld_CommentID = ?";
            update(sql, dom_comment.getCommentID());
            System.out.println("delete finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet getInstance(Dom_Comment dom_comment) {

    ResultSet instance = null;
        try {
        String sql = "SELECT fld_commentID, fld_commentTime,fld_commentDate, fld_commentText, fld_Author FROM Tbl_Comment where Fld_CommentID = ?";
        instance = CRUD_Util.getInstance(sql, dom_comment.getCommentID());
        return instance;
    } catch (Exception e) {
        e.printStackTrace();
    }
        return null;
}
    @Override
    public ArrayList<Dom_Comment> getAll() {

        try {
            String sql = "SELECT * FROM tbl_Comment";
            ResultSet table = getTable(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    }
