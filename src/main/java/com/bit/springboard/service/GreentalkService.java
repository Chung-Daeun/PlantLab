package com.bit.springboard.service;

import com.bit.springboard.dto.Criteria;
import com.bit.springboard.dto.GreentalkCommentDto;
import com.bit.springboard.dto.GreentalkDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface GreentalkService {
    void green_post(GreentalkDto greentalkDto, MultipartFile[] uploadFiles);
    void green_modify(GreentalkDto greentalkDto);
    void green_delete(int id);
    void updateCnt(int id);
    List<GreentalkDto> getGreenList(Map<String, String> searchMap, Criteria cri);
    List<GreentalkDto> getGreenFileList(int id);
    GreentalkDto getGreen(int id);
    List<GreentalkDto> getPopGreenList();
    int getTotalCnt(Map<String, String> searchMap);
    List<GreentalkDto> getNorGreenList();
    GreentalkDto getGreenOne(int id);

    List<GreentalkDto> getMyGreenList(int memId);

    int writePost(GreentalkDto greentalkDto);

    List<GreentalkDto> getPopGreenLists_main();

    void filePost(GreentalkDto greentalkDto);

    List<GreentalkCommentDto> getComment(int id);

    void commentPost(GreentalkCommentDto greentalkCommentDto);


    void modifyComment(GreentalkCommentDto existingComment);
}
