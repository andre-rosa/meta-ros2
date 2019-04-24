# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodelets for pointcloud perception."
AUTHOR = "Youhei Kakiuchi <youhei@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_recognition/doc/jsk_pcl_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    image-geometry \
    interactive-markers \
    jsk-data \
    jsk-pcl-ros-utils \
    jsk-recognition-utils \
    jsk-topic-tools \
    laser-assembler \
    moveit-ros-perception \
    octomap-server \
    pcl-msgs \
    pcl-ros \
    tf \
    tf-conversions \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    checkerboard-detector \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view2 \
    interactive-markers \
    jsk-data \
    jsk-footstep-msgs \
    jsk-interactive-marker \
    jsk-pcl-ros-utils \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-topic-tools \
    kdl-conversions \
    kdl-parser \
    laser-assembler \
    moveit-core \
    moveit-ros-perception \
    nav-msgs \
    nodelet \
    octomap \
    octomap-server \
    openni-launch \
    openni2-launch \
    pcl-conversions \
    pcl-msgs \
    pcl-ros \
    python-sklearn \
    resized-image-transport \
    robot-self-filter \
    rosboost-cfg \
    roscpp-tutorials \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    topic-tools \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    checkerboard-detector \
    cv-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view2 \
    interactive-markers \
    jsk-data \
    jsk-footstep-msgs \
    jsk-interactive-marker \
    jsk-pcl-ros-utils \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-topic-tools \
    kdl-conversions \
    kdl-parser \
    laser-assembler \
    moveit-core \
    moveit-ros-perception \
    nav-msgs \
    nodelet \
    octomap \
    octomap-server \
    openni-launch \
    openni2-launch \
    pcl-conversions \
    pcl-msgs \
    pcl-ros \
    python-sklearn \
    resized-image-transport \
    robot-self-filter \
    rosboost-cfg \
    roscpp-tutorials \
    sensor-msgs \
    std-msgs \
    std-srvs \
    stereo-image-proc \
    stereo-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    topic-tools \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-perception \
    jsk-tools \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_pcl_ros/1.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a75c60291025cc7fddc6e45d76ac9e60"
SRC_URI[sha256sum] = "90d0c0bab294d0c49ab9228c91f887bd092f6400df9c1e37b834539159e2907f"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_pcl_ros-1.2.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/jsk-recognition/jsk-recognition_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/jsk-recognition/jsk-recognition_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/jsk-recognition-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
