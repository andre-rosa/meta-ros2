# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH library and ROS SMACH integration     packages."
AUTHOR = "Isaac I. Y. Saito <gm130s@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/smach"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    smach \
    smach-msgs \
    smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/executive_smach/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "19ae42cd6e954e8da1c64e79e8599c7c"
SRC_URI[sha256sum] = "5266563dc0f5888791fbf077127b3bb5539550c93496a103a4b0f3e1bafef697"
S = "${WORKDIR}/executive_smach-release-release-melodic-executive_smach-2.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/executive-smach/executive-smach_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/executive-smach/executive-smach_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/executive-smach/executive-smach-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/executive-smach/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/executive-smach/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
