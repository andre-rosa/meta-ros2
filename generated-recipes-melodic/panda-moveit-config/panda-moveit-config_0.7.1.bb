# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the panda with the MoveIt! Motion Planning Framework"
AUTHOR = "Mike Lautman <mike@picknik.ai>"
ROS_AUTHOR = "Mike Lautman <mike@picknik.ai>"
HOMEPAGE = "http://moveit.ros.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "panda_moveit_config"
ROS_BPN = "panda_moveit_config"

ROS_BUILD_DEPENDS = " \
    franka-description \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    franka-description \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    robot-state-publisher \
    topic-tools \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    franka-description \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    robot-state-publisher \
    topic-tools \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/panda_moveit_config-release/archive/release/melodic/panda_moveit_config/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "073c2c24eb19352a6ee2cb80f203b5bd"
SRC_URI[sha256sum] = "01274911d72afb49bda01ff79f7c15aec55668bc0d29342f70d3ea3be5faaa8a"
S = "${WORKDIR}/panda_moveit_config-release-release-melodic-panda_moveit_config-0.7.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('panda-moveit-config', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('panda-moveit-config', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/panda-moveit-config/panda-moveit-config_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/panda-moveit-config/panda-moveit-config-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/panda-moveit-config/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/panda-moveit-config/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
