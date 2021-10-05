package org.example.springBoot.domain.dto;

import org.example.springBoot.domain.Message;
import org.example.springBoot.domain.User;
import org.example.springBoot.domain.util.MessageHelper;
import org.hibernate.validator.constraints.Length;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

public class MessageDto {
    private Long id;
    private String text;
    private String tag;
    private User author;
    private String filename;
    private Long likes;

    public MessageDto(Message message, Long likes, Boolean meLiked) {
        this.id = message.getId();
        this.text = message.getText();
        this.tag = message.getTag();
        this.author = message.getAuthor();
        this.filename = message.getFilename();
        this.likes = likes;
        this.meLiked = meLiked;
    }

    private Boolean meLiked;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getTag() {
        return tag;
    }

    public User getAuthor() {
        return author;
    }

    public String getFilename() {
        return filename;
    }

    public Long getLikes() {
        return likes;
    }

    public Boolean getMeLiked() {
        return meLiked;
    }

    public String getAuthorName(){
        return MessageHelper.getAuthorName(author);
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id=" + id +
                ", author=" + author +
                ", likes=" + likes +
                ", meLiked=" + meLiked +
                '}';
    }
}
