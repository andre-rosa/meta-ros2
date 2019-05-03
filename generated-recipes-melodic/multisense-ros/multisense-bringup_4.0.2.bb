# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "multisense_bringup"
AUTHOR = "Carnegie Robotics <support@carnegierobotics.com>"
HOMEPAGE = "https://bitbucket.org/crl/multisense_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "multisense_bringup"

ROS_BUILD_DEPENDS = " \
    multisense-description \
    multisense-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    multisense-description \
    multisense-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    multisense-description \
    multisense-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_bringup/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f1673921540c44c402b55880095808f3"
SRC_URI[sha256sum] = "82520ea279a265a4015699da6af28432d11f37ea05b9c742774c83a989fa1294"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_bringup-4.0.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('multisense-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multisense-ros/multisense-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multisense-ros/multisense-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multisense-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/multisense-ros/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
