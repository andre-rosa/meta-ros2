# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "segmentation"
AUTHOR = "Abraham Monrroy <abrahammonrroy@yahoo.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BUILD_DEPENDS = " \
    angles \
    diagnostic-updater \
    dynamic-reconfigure \
    libpcap \
    message-generation \
    nodelet \
    pcl \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    roslaunch \
    roslib \
    rospy \
    rostest \
    rslidar-msgs \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    nodelet \
    pcl \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    roslib \
    rospy \
    rslidar-msgs \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    diagnostic-updater \
    dynamic-reconfigure \
    message-runtime \
    nodelet \
    pcl \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    roslib \
    rospy \
    rslidar-msgs \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_driver/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "42d0451f4f328948eebde098a8cea5cb"
SRC_URI[sha256sum] = "7f1ae8931ebeb64b13cf0b1976fb269a63257de51d8de79c6cebbd716a307661"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar_driver-1.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robosense/robosense_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robosense/robosense_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/robosense-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
