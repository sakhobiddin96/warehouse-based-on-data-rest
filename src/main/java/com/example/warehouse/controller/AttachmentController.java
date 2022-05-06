package com.example.warehouse.controller;

import com.example.warehouse.service.AttachmentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;
    @GetMapping("/{id}")
    public void getFile(HttpServletResponse httpServletResponse, @PathVariable Integer id) throws IOException {
        attachmentService.downloadAttachment(httpServletResponse,id);
    }
    @PostMapping
    public String uploadFile(MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        attachmentService.uploadAttachment(multipartHttpServletRequest);
        return "Attachment saved";
    }
}
