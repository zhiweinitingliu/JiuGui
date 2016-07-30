package com.jiugui.shop.resetbuild.jiugui.model;

/**
 * Created by jyd-pc9052 on 16/5/7.
 */
public class SlideImage {
    /**
     * id : 57162292e13823601daae7a0
     * field_mark : 1
     * event_mark : 1
     * event_memo : 569495feaf4843725f000046
     * img : /system/carousel_applies/avatars/5729/9db6/5b62/8220/64d5/47d0/original/Photo_by__migeophoto__The_glaciers_in_Patagonia_are_an_endangered_species._After_centuries_they_are_melting_at_a_rate_that_is_barely_comprehensible._Today_I_hiked_to_the_French_Glacier_and_saw_that_in_only_two_weeks_it_has_receded_almost_2_meters._Ne.jpg?1462345142
     * url :
     */

    private String id;
    private int field_mark;
    private int event_mark;
    private String event_memo;
    private String img;
    private String url;
    private String url_share_logo;
    private String url_share_title;
    private String url_share_content;
    private String product_group_title;

    public String getProduct_group_title() {
        return product_group_title;
    }

    public void setProduct_group_title(String product_group_title) {
        this.product_group_title = product_group_title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setField_mark(int field_mark) {
        this.field_mark = field_mark;
    }

    public void setEvent_mark(int event_mark) {
        this.event_mark = event_mark;
    }

    public void setEvent_memo(String event_memo) {
        this.event_memo = event_memo;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public int getField_mark() {
        return field_mark;
    }

    public int getEvent_mark() {
        return event_mark;
    }

    public String getEvent_memo() {
        return event_memo;
    }

    public String getImg() {
        return img;
    }

    public String getUrl() {
        return url;
    }

    public String getUrl_share_logo() {
        return url_share_logo;
    }

    public void setUrl_share_logo(String url_share_logo) {
        this.url_share_logo = url_share_logo;
    }

    public String getUrl_share_title() {
        return url_share_title;
    }

    public void setUrl_share_title(String url_share_title) {
        this.url_share_title = url_share_title;
    }

    public String getUrl_share_content() {
        return url_share_content;
    }

    public void setUrl_share_content(String url_share_content) {
        this.url_share_content = url_share_content;
    }
}
