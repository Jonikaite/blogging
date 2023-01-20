package lt.techin.blogging.dao;

import lt.techin.blogging.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRecord extends JpaRepository<Comment, Long> {

}
