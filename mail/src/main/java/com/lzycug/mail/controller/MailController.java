
package com.lzycug.mail.controller;

import com.lzycug.mail.pojo.Result;
import com.lzycug.mail.pojo.User;
import com.lzycug.mail.service.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author lzycug
 * @since 2020-03-24
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    MailService mailService;

    @PostMapping("sendText")
    public Result sendTextMail(String recipient, String subject, String message) {
        mailService.sendTextMail(recipient, subject, message);
        return Result.ok();
    }

    @PostMapping("sendFreemarkerMail")
    public Result sendFreemarkerMail(String recipient, String subject, User user) {
        try {
            mailService.sendFreemarkerMail(recipient, subject, user);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();
        }
        return Result.ok();
    }
}
