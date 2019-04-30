# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge for 3D applications involving n-D Point Clouds and 3D geometry   processing in ROS."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    rosconsole \
    roscpp \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_ros/1.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c98c1f93b9a8b343a3fcd34da718400a"
SRC_URI[sha256sum] = "deb1b59fcc5f3f9247e9fa90e7f5bde35d22668aa13a9300a4d6d3315552215e"
S = "${WORKDIR}/perception_pcl-release-release-melodic-pcl_ros-1.6.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/perception-pcl/perception-pcl_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/perception-pcl/perception-pcl_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/perception-pcl/perception-pcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/perception-pcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/perception-pcl/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
