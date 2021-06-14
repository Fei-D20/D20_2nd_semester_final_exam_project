package com.db.daoimplement.eventcard;

import com.db.dao.eventcard.IF_CommentDao;
import com.db.util.CRUD_Util;
import com.domain.eventcard.Dom_Comment;

import java.sql.Date;
import java.sql.ResultSet;

import static com.db.util.CRUD_Util.getTable;
import static com.db.util.CRUD_Util.update;

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
        Date date;
        try {
            String sql = "INSERT INTO  tbl_Comment(fld_commentID, fld_commentTime, fld_commentText, fld_Author) values (?,?,?,?)";
            if (dom_comment.getLocalDate() != null) {
                date = Date.valueOf(dom_comment.getLocalDate());
            } else {
                date = Date.valueOf("2000-0-0");
            }
            update(
                    sql,
                    dom_comment.getCommentID(),
                    date,
                    dom_comment.getCommentText(),
                    dom_comment.getCommentAuthor()
            );
            System.out.println("The Comment : " + dom_comment.getCommentText() + "   saved into database is successful ! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(Dom_Comment dom_comment) {
        Date date;
        try {
            String sql = "UPDATE tbl_Comment SET fld_Author = ?,fld_CommentTime = ? ,fld_CommentText = ? where fld_CommentId = ?";
            if(dom_comment.getLocalDate() != null){
                date = Date.valueOf(dom_comment.getLocalDate());

            } else {
                date = java.sql.Date.valueOf("2000-1-1");

            }
            update(
                    sql,
                    dom_comment.getCommentAuthor(),
                    date,
                    dom_comment.getCommentText(),
                    dom_comment.getCommentID()
            );
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

        ResultSet instance;

        try {
            String sql = "SELECT fld_CommentTime,fld_commentText, fld_Author FROM Tbl_Comment where Fld_CommentID = ?";
            instance = CRUD_Util.getInstance(sql, dom_comment.getCommentID());

            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public ResultSet getAll() {
        try {
            String sql = "SELECT * FROM tbl_Comment";
            return getTable(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
