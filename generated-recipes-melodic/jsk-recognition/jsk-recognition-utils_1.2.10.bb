# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "C++ library about sensor model, geometrical modeling and perception."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://jsk-docs.readthedocs.io/en/latest/jsk_recognition/jsk_recognition_utils"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "jsk_recognition_utils"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    jsk-recognition-msgs \
    jsk-topic-tools \
    message-generation \
    pcl-msgs \
    pcl-ros \
    python-cython \
    qtbase \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    jsk-recognition-msgs \
    jsk-topic-tools \
    message-runtime \
    pcl-msgs \
    pcl-ros \
    python-chainer-pip \
    python-skimage \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    jsk-recognition-msgs \
    jsk-topic-tools \
    message-runtime \
    pcl-msgs \
    pcl-ros \
    python-chainer-pip \
    python-skimage \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-tools \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition_utils/1.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6497864fd86cc39dcbe035e5f88ec449"
SRC_URI[sha256sum] = "942d735c8f41e66b1417c0dea17f7e5e511a0b47154341c5f0c45359b89de95c"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition_utils-1.2.10-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-recognition', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/jsk-recognition_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/jsk-recognition-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-recognition/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
