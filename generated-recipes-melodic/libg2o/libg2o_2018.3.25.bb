# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The libg2o library from http://openslam.org/g2o.html"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Rainer Kuemmerle"
HOMEPAGE = "https://github.com/RainerKuemmerle/g2o"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "libg2o"
ROS_BPN = "libg2o"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    mesa \
    suitesparse \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    catkin \
    libeigen \
    mesa \
    suitesparse \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    catkin \
    libeigen \
    mesa \
    suitesparse \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/libg2o-release/archive/release/melodic/libg2o/2018.3.25-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a49dd32356f0b4b30080d16757089fe2"
SRC_URI[sha256sum] = "b904a96dd4edffa57b21856d75d7d0bf9b064921e330012922c67a545ee54f6a"
S = "${WORKDIR}/libg2o-release-release-melodic-libg2o-2018.3.25-0"

ROS_BUILD_TYPE = "cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('libg2o', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('libg2o', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libg2o/libg2o_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libg2o/libg2o-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libg2o/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libg2o/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
