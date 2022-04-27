package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="custmer")
public class CustmerEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        // @Column(name="DocumentType")
        private String DocumentType;
        private String Mandatory;
        private Date ExpirayDate;
        private Date ExpectedDateofSubmission;
        private Date ActualDateofSubmission;
        private String DocumentReference;
        private String Checked;

        public CustmerEntity() {
        }

        public CustmerEntity(long id, String documentType, String mandatory, Date expirayDate, Date expectedDateofSubmission, Date actualDateofSubmission, String documentReference, String checked) {
            this.id = id;
            DocumentType = documentType;
            Mandatory = mandatory;
            ExpirayDate = expirayDate;
            ExpectedDateofSubmission = expectedDateofSubmission;
            ActualDateofSubmission = actualDateofSubmission;
            DocumentReference = documentReference;
            Checked = checked;
        }

        public String getDocumentType() {
            return DocumentType;
        }

        public void setDocumentType(String documentType) {
            DocumentType = documentType;
        }

        public String getMandatory() {
            return Mandatory;
        }

        public void setMandatory(String mandatory) {
            Mandatory = mandatory;
        }

        public Date getExpirayDate() {
            return ExpirayDate;
        }

        public void setExpirayDate(Date expirayDate) {
            ExpirayDate = expirayDate;
        }

        public Date getExpectedDateofSubmission() {
            return ExpectedDateofSubmission;
        }

        public void setExpectedDateofSubmission(Date expectedDateofSubmission) {
            ExpectedDateofSubmission = expectedDateofSubmission;
        }

        public Date getActualDateofSubmission() {
            return ActualDateofSubmission;
        }

        public void setActualDateofSubmission(Date actualDateofSubmission) {
            ActualDateofSubmission = actualDateofSubmission;
        }

        public String getDocumentReference() {
            return DocumentReference;
        }

        public void setDocumentReference(String documentReference) {
            DocumentReference = documentReference;
        }

        public String getChecked() {
            return Checked;
        }

        public void setChecked(String checked)
        {
            Checked = checked;
        }
    }


