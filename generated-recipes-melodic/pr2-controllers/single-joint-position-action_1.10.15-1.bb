# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The single joint position action is a node that provides an action   interface for commanding a trajectory to move a joint to a particular   position. The action reports success when the joint reaches the desired   position."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Stuart Glaser"
HOMEPAGE = "http://ros.org/wiki/single_joint_position_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_controllers"
ROS_BPN = "single_joint_position_action"

ROS_BUILD_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/single_joint_position_action/1.10.15-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "500d58f09b1760dedc4beab99461e2df"
SRC_URI[sha256sum] = "52bd7e24d99be30953d7cf5ae23d1cd007b0863b86aa4dab5b3dcb741cca41a8"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-single_joint_position_action-1.10.15-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('pr2-controllers', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pr2-controllers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/pr2-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/pr2-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-controllers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
