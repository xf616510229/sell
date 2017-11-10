# 微信点餐数据库DDL


```sql
-- 类目
create table `product_category` (
    `category_id` int not null auto_increment,
    `category_name` varchar(64) not null comment '类目名字',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`category_id`)
);

-- 商品
create table `product_info` (
    `product_id` varchar(32) not null,
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '单价',
    `product_stock` int not null comment '库存',
    `product_description` varchar(64) comment '描述',
    `product_icon` varchar(512) comment '小图',
    `product_status` tinyint(3) DEFAULT '0' COMMENT '商品状态,0正常1下架',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`product_id`)
);

-- 订单
create table `order_master` (
    `order_id` varchar(32) not null,
    `buyer_name` varchar(32) not null comment '买家名字',
    `buyer_phone` varchar(32) not null comment '买家电话',
    `buyer_address` varchar(128) not null comment '买家地址',
    `buyer_openid` varchar(64) not null comment '买家微信openid',
    `order_amount` decimal(8,2) not null comment '订单总金额',
    `order_status` tinyint(3) not null default '0' comment '订单状态, 默认为新下单',
    `pay_status` tinyint(3) not null default '0' comment '支付状态, 默认未支付',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`order_id`),
    key `idx_buyer_openid` (`buyer_openid`)
);

-- 订单商品
create table `order_detail` (
    `detail_id` varchar(32) not null,
    `order_id` varchar(32) not null,
    `product_id` varchar(32) not null,
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '当前价格,单位分',
    `product_quantity` int not null comment '数量',
    `product_icon` varchar(512) comment '小图',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`detail_id`),
    key `idx_order_id` (`order_id`)
);

-- 卖家(登录后台使用, 卖家登录之后可能直接采用微信扫码登录，不使用账号密码)
create table `seller_info` (
    `id` varchar(32) not null,
    `username` varchar(32) not null,
    `password` varchar(32) not null,
    `openid` varchar(64) not null comment '微信openid',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`id`)
) comment '卖家信息表';

```


# 测试数据

```sql
-- 商品类别
INSERT INTO product_category(category_id, category_name, category_type) 
  VALUES(1, '热销', 1); 
INSERT INTO product_category(category_id, category_name, category_type) 
  VALUES(2, '主食', 2); 
INSERT INTO product_category(category_id, category_name, category_type) 
  VALUES(3, '菜品', 3); 

-- 商品信息
INSERT INTO product_info(product_id, product_name, product_price, product_stock, product_description, product_icon, category_type) 
  VALUES('111112', '皮蛋粥', 2.5, 100, '皮蛋瘦肉精品之作', 'http://xxx/xxx.jpg', 1);
INSERT INTO product_info(product_id, product_name, product_price, product_stock, product_description, product_icon, category_type) 
  VALUES('111113', '青椒肉丝', 10.2, 100, '送米饭', 'http://xxx/xxx.jpg', 1);
INSERT INTO product_info(product_id, product_name, product_price, product_stock, product_description, product_icon, category_type) 
  VALUES('111114', '老母鸡汤', 8.2, 100, '农家老母鸡', 'http://xxx/xxx.jpg', 3);

-- 订单信息
INSERT INTO order_master(order_id, buyer_name, buyer_phone, buyer_address, buyer_openid, order_amount) 
  VALUES('112330', '小明', '18945678899', '甲等大厦', '12345678', 200.0);
INSERT INTO order_master(order_id, buyer_name, buyer_phone, buyer_address, buyer_openid, order_amount) 
  VALUES('112331', '小明', '18945678899', '甲等大厦', '12345678', 150.0);

-- 订单详情
INSERT INTO order_detail(detail_id, order_id, product_id, product_name, product_price, product_quantity, product_icon) 
  VALUES('11233101', '112331', '1111112', '皮蛋粥', 2.5, 40, 'http://xxx/xxx.jpg');
  
-- 卖家信息
INSERT INTO seller_info(id, username, password, openid, seller_id) 
  VALUES ('12345', 'sz12233', '1234567', '1234567888765', '12342342');
```

