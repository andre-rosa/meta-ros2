# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Common base code for ROS1/ROS2 H264 encoder node"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/h264_encoder_core"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e181b18ed9533044a61dea448605dcd5"

ROS_CN = "h264_encoder_core"
ROS_BPN = "h264_encoder_core"

ROS_BUILD_DEPENDS = " \
    aws-common \
    ffmpeg \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    ffmpeg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/h264_encoder_core-release/archive/release/melodic/h264_encoder_core/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "28e16ed473f97048b6966bd8ee249854"
SRC_URI[sha256sum] = "67e0ef7ef6d8f71198043fa55ce97ec74cd53cc1c9caf3e21f04dc58df7c7fb5"
S = "${WORKDIR}/h264_encoder_core-release-release-melodic-h264_encoder_core-2.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('h264-encoder-core', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('h264-encoder-core', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/h264-encoder-core/h264-encoder-core_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/h264-encoder-core/h264-encoder-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/h264-encoder-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/h264-encoder-core/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
