package com.example.demo.Entity;

import javax.persistence.*;
import java.awt.*;
import java.awt.dnd.DropTargetDragEvent;
import java.util.Date;

@Entity
@Table(name="DocumentList")
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private DropTargetDragEvent DocumentType;
    private String Mandatory;
    private Date ExpirayDate;
    private Date ExpectedDateofSubmission;
    private Date ActualDateofSubmission;
    private String DocumentsReference;
    private Checkbox Checked;


}
