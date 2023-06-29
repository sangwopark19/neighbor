package com.anabada.neighbor.file.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ImageInfo {
    private String name;
    private String url;
}
