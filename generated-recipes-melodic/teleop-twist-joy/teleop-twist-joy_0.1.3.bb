# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "http://wiki.ros.org/teleop_twist_joy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "teleop_twist_joy"
ROS_BPN = "teleop_twist_joy"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    joy \
    roscpp \
    roslaunch \
    roslint \
    rostest \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    joy \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    joy \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-teleop/teleop_twist_joy-release/archive/release/melodic/teleop_twist_joy/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ec6dd150973ca911b5f06ccba9abe0a4"
SRC_URI[sha256sum] = "3e9186dd642c84cc2776994b6afa7a97a9a4759d53170c1e1f9fddd9fbc789e4"
S = "${WORKDIR}/teleop_twist_joy-release-release-melodic-teleop_twist_joy-0.1.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('teleop-twist-joy', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('teleop-twist-joy', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/teleop-twist-joy_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/teleop-twist-joy-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teleop-twist-joy/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
