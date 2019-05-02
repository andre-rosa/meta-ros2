# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demos for fetch_gazebo package."
AUTHOR = "Alex Moriarty <amoriarty@fetchrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/fetch_gazebo_demo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "fetch_gazebo_demo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    fetch-gazebo \
    fetch-moveit-config \
    fetch-navigation \
    moveit-commander \
    moveit-python \
    simple-grasping \
    teleop-twist-keyboard \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    fetch-gazebo \
    fetch-moveit-config \
    fetch-navigation \
    moveit-commander \
    moveit-python \
    simple-grasping \
    teleop-twist-keyboard \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo_demo/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ca4a26cb9684e08be6222188dbcea0d3"
SRC_URI[sha256sum] = "07c57825c60fb935a99013eec3b272268a0b4d4564b9d68599dbdf7eff3e5389"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo_demo-0.9.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fetch-gazebo/fetch-gazebo_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fetch-gazebo/fetch-gazebo_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/fetch-gazebo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fetch-gazebo/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
