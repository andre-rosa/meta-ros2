# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The fetchit_challenge package"
AUTHOR = "RDaneelOlivaw <duckfrost@theconstructsim.com>"
HOMEPAGE = "https://opensource.fetchrobotics.com/competition"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "fetchit_challenge"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    effort-controllers \
    fetch-gazebo \
    gazebo-ros \
    robot-state-publisher \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetchit_challenge/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "da0758d982be95ab75be92c44fd4ab0c"
SRC_URI[sha256sum] = "0805738f391830e5c290041438956c70fdfa476e0e18535f3797d904bc0e823f"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetchit_challenge-0.9.1-0"

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
