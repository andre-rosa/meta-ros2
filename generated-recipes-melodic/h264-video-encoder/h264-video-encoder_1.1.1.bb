# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "ROS1 H264 encoder node"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/h264_video_encoder"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e181b18ed9533044a61dea448605dcd5"

ROS_CN = "h264_video_encoder"
ROS_BPN = "h264_video_encoder"

ROS_BUILD_DEPENDS = " \
    aws-ros1-common \
    h264-encoder-core \
    image-transport \
    kinesis-video-msgs \
    message-generation \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-ros1-common \
    image-transport \
    image-transport-plugins \
    kinesis-video-msgs \
    message-runtime \
    sensor-msgs \
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

SRC_URI = "https://github.com/aws-gbp/h264_video_encoder-release/archive/release/melodic/h264_video_encoder/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bb1eac25232a8a8105199bcd5494b027"
SRC_URI[sha256sum] = "c295ba7a0e8cb25eacccc5092b810f0951c20268345218d2634bd6ecc30d0608"
S = "${WORKDIR}/h264_video_encoder-release-release-melodic-h264_video_encoder-1.1.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('h264-video-encoder', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('h264-video-encoder', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/h264-video-encoder/h264-video-encoder_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/h264-video-encoder/h264-video-encoder-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/h264-video-encoder/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/h264-video-encoder/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
