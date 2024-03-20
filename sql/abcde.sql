/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.17-log : Database - abcde
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`abcde` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `abcde`;

/*Table structure for table `t_article` */

DROP TABLE IF EXISTS `t_article`;

CREATE TABLE `t_article` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `title` varchar(200) DEFAULT NULL COMMENT '文章标题',
  `content` longtext COMMENT '文章内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_article` */

insert  into `t_article`(`id`,`title`,`content`) values (1,'Spring Boot基础入门','从入门到精通讲解...'),(2,'Spring Cloud基础入门','从入门到精通讲解...');

/*Table structure for table `t_comment` */

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `content` longtext COMMENT '评论内容',
  `author` varchar(200) DEFAULT NULL COMMENT '评论作者',
  `a_id` int(20) DEFAULT NULL COMMENT '关联的文章id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_comment` */

insert  into `t_comment`(`id`,`content`,`author`,`a_id`) values (1,'很全、很详细','狂奔的蜗牛',1),(2,'赞一个','tom',1),(3,'很详细','kitty',1),(4,'很好，非常详细','张三',1),(5,'很不错','张杨',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
