package org.ddelizia.vcrud.media.service;

import org.ddelizia.vcrud.media.model.Image;
import org.ddelizia.vcrud.media.model.Preset;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created with IntelliJ IDEA.
 * User: danilo.delizia
 * Date: 3/07/13
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
public interface ImageService extends MediaService{

    public Image storeImage(MultipartFile multipartFile);

    public Image storeImage(MultipartFile multipartFile, String code);

    public Image storeImage(byte [] bytes, String code);

    public String getImagePath(Image image);

    public String getImagePath(String imageCode);

    public String getImagePathForPreset (Image image, Preset preset);

}