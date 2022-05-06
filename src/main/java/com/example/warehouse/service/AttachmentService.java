package com.example.warehouse.service;

import com.example.warehouse.entity.Attachment;
import com.example.warehouse.entity.AttachmentContent;
import com.example.warehouse.repository.AttachmentContentRepository;
import com.example.warehouse.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;
    public String uploadAttachment(MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        Iterator<String> fileNames = multipartHttpServletRequest.getFileNames();
        MultipartFile file = multipartHttpServletRequest.getFile(fileNames.next());
        if (file!=null){
            String originalFilename = file.getOriginalFilename();
            byte[] bytes = file.getBytes();
            String name = file.getName();
            String contentType = file.getContentType();
            long size = file.getSize();
            String originalFilename1 = file.getOriginalFilename();
            Attachment attachment=new Attachment();
            attachment.setContentType(contentType);
            attachment.setName(name);
            attachment.setSize(size);
            attachment.setOriginalName(originalFilename);
            Attachment savedAttachment = attachmentRepository.save(attachment);
            AttachmentContent attachmentContent=new AttachmentContent();
            attachmentContent.setAttachment(savedAttachment);
            attachmentContent.setBytes(bytes);
            attachmentContentRepository.save(attachmentContent);
            return "Attachment uploaded";

        }
        return "System error";
    }
    public String downloadAttachment(HttpServletResponse httpServletResponse, Integer id) throws IOException {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()){
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findByAttachment_Id(id);
            if (optionalAttachmentContent.isPresent()){
                AttachmentContent attachmentContent = optionalAttachmentContent.get();
                httpServletResponse.setHeader("Content-Disposition","attachment; filename=\""+attachment.getOriginalName()+"\"");
                httpServletResponse.setContentType(attachment.getContentType());

                FileCopyUtils.copy(attachmentContent.getBytes(),httpServletResponse.getOutputStream());
                return "Attachment saved";
            }
        }
        return  "System error";
    }
}
