# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "TurtleBot3 AutoRace ROS package that controls Raspberry Pi Camera, and process the image"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Gilbert <kkjong@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_autorace_camera"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3_autorace"
ROS_BPN = "turtlebot3_autorace_camera"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    python-opencv \
    rospy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace_camera/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "01b06d48ad31f5b7cfb7d3a7d44ca95f"
SRC_URI[sha256sum] = "fe6adfc679b7e08c054367e89c6a94da5cbecbd7f51411298fd4d795c61138de"
S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace_camera-1.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('turtlebot3-autorace', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('turtlebot3-autorace', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-autorace/turtlebot3-autorace_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-autorace/turtlebot3-autorace-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-autorace/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot3-autorace/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
