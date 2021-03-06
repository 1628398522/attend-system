package com.tsl.attendsystem.service;

import com.tsl.attendsystem.entity.Attend;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AttendService {

    String upload(String classes, MultipartFile nameListExcel);

    String sign(String name);

    List<Attend> findAllBySign(Integer sign);
}
