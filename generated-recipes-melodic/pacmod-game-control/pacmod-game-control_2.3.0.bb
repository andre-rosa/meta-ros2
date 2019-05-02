# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Package for controlling the AStuff PACMod with a Joystick"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/pacmod_game_control"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "pacmod_game_control"

ROS_BUILD_DEPENDS = " \
    joy \
    pacmod-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joy \
    pacmod-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joy \
    pacmod-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/astuff/pacmod_game_control-release/archive/release/melodic/pacmod_game_control/2.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "33eae0cd5b6082e748ceb703cad95227"
SRC_URI[sha256sum] = "279a95661041ef6f88cf7ba26f5f61af4010fac0ca579a38eddad0088f6dcabb"
S = "${WORKDIR}/pacmod_game_control-release-release-melodic-pacmod_game_control-2.3.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/pacmod-game-control/pacmod-game-control_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/pacmod-game-control/pacmod-game-control_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pacmod-game-control/pacmod-game-control-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pacmod-game-control/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pacmod-game-control/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
