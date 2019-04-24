# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Kinesis Video Streams producer node"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/kinesis_video_streamer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "kinesis_video_streamer"
ROS_BPN = "kinesis_video_streamer"

ROS_BUILD_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    image-transport \
    kinesis-manager \
    kinesis-video-msgs \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    image-transport \
    kinesis-manager \
    kinesis-video-msgs \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    image-transport \
    kinesis-manager \
    kinesis-video-msgs \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rostopic \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/melodic/kinesis_video_streamer/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "94777b21d2f4f21faac8bc284e0cd295"
SRC_URI[sha256sum] = "63f75867b432622944356a87a290bd76e4ad6bd76b5dc98306905eade52c16f1"
S = "${WORKDIR}/kinesis_video_streamer-release-release-melodic-kinesis_video_streamer-2.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('kinesis-video-streamer', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('kinesis-video-streamer', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kinesis-video-streamer/kinesis-video-streamer_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kinesis-video-streamer/kinesis-video-streamer-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kinesis-video-streamer/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kinesis-video-streamer/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
