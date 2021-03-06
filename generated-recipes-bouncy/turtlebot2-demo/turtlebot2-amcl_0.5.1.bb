# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Demo of turtlebot2 localization with amcl."
AUTHOR = "D. Hood <dhood@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    ament-index-python \
    astra-camera \
    depthimage-to-laserscan \
    joy \
    launch \
    map-server \
    ros2run \
    teleop-twist-joy \
    tf2-ros \
    turtlebot2-drivers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_amcl/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "973b5ad97fb2f45d1a76fc89586cdb01"
SRC_URI[sha256sum] = "1839b6c737ebb6682ff17bcdef6dcc918ee3f023432e9e5986cb03e8dc67f162"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_amcl-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/turtlebot2-demo/turtlebot2-demo_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/turtlebot2-demo/turtlebot2-demo_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/turtlebot2-demo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/turtlebot2-demo/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
