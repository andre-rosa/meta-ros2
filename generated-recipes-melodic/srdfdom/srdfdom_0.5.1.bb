# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "Dave Coleman <dave@dav.ee>"
HOMEPAGE = "http://ros.org/wiki/srdfdom"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "srdfdom"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    console-bridge \
    libtinyxml \
    liburdfdom-headers-dev \
    urdf \
    urdfdom-py \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    console-bridge \
    libtinyxml \
    liburdfdom-headers-dev \
    urdfdom-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    console-bridge \
    libtinyxml \
    liburdfdom-headers-dev \
    urdfdom-py \
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

SRC_URI = "https://github.com/ros-gbp/srdfdom-release/archive/release/melodic/srdfdom/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7d12c4159059d959949c610163bd4858"
SRC_URI[sha256sum] = "97b4cf0327af9082df3270024ceaa89d6b577bb2cbc09a5b19838557189e96f1"
S = "${WORKDIR}/srdfdom-release-release-melodic-srdfdom-0.5.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('srdfdom', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/srdfdom/srdfdom_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/srdfdom/srdfdom-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/srdfdom/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/srdfdom/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
