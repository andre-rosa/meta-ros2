# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and higher-level vision processing."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/image_pipeline"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "image_pipeline"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration \
    depth-image-proc \
    image-proc \
    image-publisher \
    image-rotate \
    image-view \
    stereo-image-proc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-calibration \
    depth-image-proc \
    image-proc \
    image-publisher \
    image-rotate \
    image-view \
    stereo-image-proc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_pipeline/1.12.23-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a28d68df17541f7216448c02f30fec20"
SRC_URI[sha256sum] = "a6e5d39fd81ad438d67124e646c3da415e14afb3d0e59931e0d40433a6c1ea77"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_pipeline-1.12.23-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('image-pipeline', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/image-pipeline_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/image-pipeline-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/image-pipeline/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
