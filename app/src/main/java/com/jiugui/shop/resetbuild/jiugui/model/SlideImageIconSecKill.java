package com.jiugui.shop.resetbuild.jiugui.model;

import java.util.List;

/**
 * Created by jyd on 16/7/21.
 * 带有轮播图 icon 秒杀的model
 */
public class SlideImageIconSecKill {
    List<SlideImage> carousel_list;

    List<HomeIcon> icon_list;

    public List<HomeIcon> getIcon_list() {
        return icon_list;
    }

    public void setIcon_list(List<HomeIcon> icon_list) {
        this.icon_list = icon_list;
    }

    public List<SlideImage> getCarousel_list() {
        return carousel_list;
    }

    public void setCarousel_list(List<SlideImage> carousel_list) {
        this.carousel_list = carousel_list;
    }

    public class HomeIcon {
        private String title;
        private String picture_url;
        private String event_mark;
        private String event_memo;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicture_url() {
            return picture_url;
        }

        public void setPicture_url(String picture_url) {
            this.picture_url = picture_url;
        }

        public String getEvent_mark() {
            return event_mark;
        }

        public void setEvent_mark(String event_mark) {
            this.event_mark = event_mark;
        }

        public String getEvent_memo() {
            return event_memo;
        }

        public void setEvent_memo(String event_memo) {
            this.event_memo = event_memo;
        }
    }

    public SecKillRoundInfo getSec_kill_round_info() {
        return sec_kill_round_info;
    }

    public void setSec_kill_round_info(SecKillRoundInfo sec_kill_round_info) {
        this.sec_kill_round_info = sec_kill_round_info;
    }

    private SecKillRoundInfo sec_kill_round_info;

    public class SecKillRoundInfo {
        private String sec_kill_round_title;
        private String sec_kill_round_start_time;
        private String sec_kill_round_end_time;
        private String sec_kill_round_status;
        private String server_now_time;

        public String getServer_now_time() {
            return server_now_time;
        }

        public void setServer_now_time(String server_now_time) {
            this.server_now_time = server_now_time;
        }

        private List<SecKillProduct> product_list;

        public String getSec_kill_round_title() {
            return sec_kill_round_title;
        }

        public void setSec_kill_round_title(String sec_kill_round_title) {
            this.sec_kill_round_title = sec_kill_round_title;
        }

        public String getSec_kill_round_start_time() {
            return sec_kill_round_start_time;
        }

        public void setSec_kill_round_start_time(String sec_kill_round_start_time) {
            this.sec_kill_round_start_time = sec_kill_round_start_time;
        }

        public String getSec_kill_round_end_time() {
            return sec_kill_round_end_time;
        }

        public void setSec_kill_round_end_time(String sec_kill_round_end_time) {
            this.sec_kill_round_end_time = sec_kill_round_end_time;
        }

        public String getSec_kill_round_status() {
            return sec_kill_round_status;
        }

        public void setSec_kill_round_status(String sec_kill_round_status) {
            this.sec_kill_round_status = sec_kill_round_status;
        }

        public List<SecKillProduct> getProduct_list() {
            return product_list;
        }

        public void setProduct_list(List<SecKillProduct> product_list) {
            this.product_list = product_list;
        }

        public class SecKillProduct {
            private String sec_kill_product_id;
            private String product_id;
            private String product_title;
            private String product_specification;
            private String product_tags;
            private String product_avatar_url;
            private float product_price;
            private float product_sec_kill_price;
            private int sec_kill_stock;
            private int sec_kill_sale;
            private int sec_kill_count_limit;
            private int customer_can_killed_count;
            private int customer_is_follow;

            public String getSec_kill_product_id() {
                return sec_kill_product_id;
            }

            public void setSec_kill_product_id(String sec_kill_product_id) {
                this.sec_kill_product_id = sec_kill_product_id;
            }

            public String getProduct_id() {
                return product_id;
            }

            public void setProduct_id(String product_id) {
                this.product_id = product_id;
            }

            public String getProduct_title() {
                return product_title;
            }

            public void setProduct_title(String product_title) {
                this.product_title = product_title;
            }

            public String getProduct_specification() {
                return product_specification;
            }

            public void setProduct_specification(String product_specification) {
                this.product_specification = product_specification;
            }

            public String getProduct_tags() {
                return product_tags;
            }

            public void setProduct_tags(String product_tags) {
                this.product_tags = product_tags;
            }

            public String getProduct_avatar_url() {
                return product_avatar_url;
            }

            public void setProduct_avatar_url(String product_avatar_url) {
                this.product_avatar_url = product_avatar_url;
            }

            public float getProduct_price() {
                return product_price;
            }

            public void setProduct_price(float product_price) {
                this.product_price = product_price;
            }

            public float getProduct_sec_kill_price() {
                return product_sec_kill_price;
            }

            public void setProduct_sec_kill_price(float product_sec_kill_price) {
                this.product_sec_kill_price = product_sec_kill_price;
            }

            public int getSec_kill_stock() {
                return sec_kill_stock;
            }

            public void setSec_kill_stock(int sec_kill_stock) {
                this.sec_kill_stock = sec_kill_stock;
            }

            public int getSec_kill_sale() {
                return sec_kill_sale;
            }

            public void setSec_kill_sale(int sec_kill_sale) {
                this.sec_kill_sale = sec_kill_sale;
            }

            public int getSec_kill_count_limit() {
                return sec_kill_count_limit;
            }

            public void setSec_kill_count_limit(int sec_kill_count_limit) {
                this.sec_kill_count_limit = sec_kill_count_limit;
            }

            public int getCustomer_can_killed_count() {
                return customer_can_killed_count;
            }

            public void setCustomer_can_killed_count(int customer_can_killed_count) {
                this.customer_can_killed_count = customer_can_killed_count;
            }

            public int getCustomer_is_follow() {
                return customer_is_follow;
            }

            public void setCustomer_is_follow(int customer_is_follow) {
                this.customer_is_follow = customer_is_follow;
            }
        }
    }

}
