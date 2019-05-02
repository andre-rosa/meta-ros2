# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Minimalist examples of composing nodes in the same   process"
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "examples_rclcpp_minimal_composition"

ROS_BUILD_DEPENDS = " \
    class-loader \
    rclcpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    rclcpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_composition/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "950c03b36771f2ac998618890b6d5fd1"
SRC_URI[sha256sum] = "45f97841606fdf79c8dc099a9df0fe8a2afa7ef73080d8f55166f44ec76d3b72"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_composition-0.5.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/examples/examples_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/examples/examples_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
