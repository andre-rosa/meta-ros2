# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Minimal action server examples"
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BPN = "examples_rclcpp_minimal_action_server"

ROS_BUILD_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    example-interfaces \
    rclcpp \
    rclcpp-action \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclcpp_minimal_action_server/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b608fb07d9b6dbf9964a40bf0241b4db"
SRC_URI[sha256sum] = "b05d0aabfa0ead11e5a42ebddb00917a0033ec7199cc21b1e93e262e4c9fcd64"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclcpp_minimal_action_server-0.6.3-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('examples', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
