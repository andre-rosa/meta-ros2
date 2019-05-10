# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "HPP fork of FCL with bug fixes."
AUTHOR = "Wolfgang Merkt <wolfgang.merkt@ed.ac.uk>"
HOMEPAGE = "https://github.com/humanoid-path-planner/hpp-fcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hpp-fcl"
ROS_BPN = "hpp-fcl"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    git \
    libeigen \
    octomap \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    libeigen \
    octomap \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    libeigen \
    octomap \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipab-slmc/hpp-fcl_catkin-release/archive/release/melodic/hpp-fcl/1.0.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "80497b2c83638ecd3c92e82a02e66511"
SRC_URI[sha256sum] = "f6c9669e0b2cf9cbc04bfc89014ae8a82b0895e65eec29d65ca557ca6d375a41"
S = "${WORKDIR}/hpp-fcl_catkin-release-release-melodic-hpp-fcl-1.0.1-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('hpp-fcl', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('hpp-fcl', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hpp-fcl/hpp-fcl_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hpp-fcl/hpp-fcl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hpp-fcl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hpp-fcl/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
