# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "chomp_motion_planner"
AUTHOR = "Chittaranjan Srinivas Swaminathan <chitt@live.in>"
ROS_AUTHOR = "Gil Jones <gjones@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/chomp_motion_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "chomp_motion_planner"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/chomp_motion_planner/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f3b1e76b50470e9007fc96119045ff30"
SRC_URI[sha256sum] = "1f5bd973706dc3c014bb87d0e75f202e83db8d8d0883774f9eda58085df2b895"
S = "${WORKDIR}/moveit-release-release-melodic-chomp_motion_planner-1.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('moveit', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('moveit', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/moveit-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/moveit/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
