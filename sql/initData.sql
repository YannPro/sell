-- 类目
insert into `product_category` (`category_name`,`category_type`)
values('男生最爱','1');
insert into `product_category` (`category_name`,`category_type`)
values('女生最爱','2');
insert into `product_category` (`category_name`,`category_type`)
values('大家都爱','3');

-- 商品
insert into `product_info` (`product_id`,`product_name`,`product_price`,`product_stock`,`product_description`,`product_icon`,`product_status`,`category_type`)
values('0001','可口可乐','3.00',77,'阿斯打扫打扫','1.jpg',0,1);
insert into `product_info` (`product_id`,`product_name`,`product_price`,`product_stock`,`product_description`,`product_icon`,`product_status`,`category_type`)
values('0002','雪碧','3.00',337,'阿斯打扫41打扫','2.jpg',0,2);
insert into `product_info` (`product_id`,`product_name`,`product_price`,`product_stock`,`product_description`,`product_icon`,`product_status`,`category_type`)
values('0003','芬达','3.00',737,'阿斯打扫123打扫','3.jpg',0,3);

