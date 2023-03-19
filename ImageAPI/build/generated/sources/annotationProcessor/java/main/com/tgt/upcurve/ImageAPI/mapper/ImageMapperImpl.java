package com.tgt.upcurve.ImageAPI.mapper;

import com.tgt.upcurve.ImageAPI.entity.ImageEntity;
import com.tgt.upcurve.ImageAPI.response.ImageResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T14:47:24+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.16.1 (Eclipse Adoptium)"
)
public class ImageMapperImpl implements ImageMapper {

    @Override
    public ImageResponse toResponse(ImageEntity image) {
        if ( image == null ) {
            return null;
        }

        ImageResponse imageResponse = new ImageResponse();

        imageResponse.setId( image.getId() );
        byte[] imageCode = image.getImageCode();
        if ( imageCode != null ) {
            imageResponse.setImageCode( Arrays.copyOf( imageCode, imageCode.length ) );
        }
        imageResponse.setCreatedAt( image.getCreatedAt() );

        return imageResponse;
    }

    @Override
    public List<ImageResponse> toResponseList(List<ImageEntity> imageList) {
        if ( imageList == null ) {
            return null;
        }

        List<ImageResponse> list = new ArrayList<ImageResponse>( imageList.size() );
        for ( ImageEntity imageEntity : imageList ) {
            list.add( toResponse( imageEntity ) );
        }

        return list;
    }
}
