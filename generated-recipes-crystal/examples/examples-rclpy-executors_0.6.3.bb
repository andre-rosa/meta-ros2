# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Examples of creating and using exectors to run multiple nodes in the same process"
AUTHOR = "Shane Loretz <sloretz@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "examples"
ROS_BPN = "examples_rclpy_executors"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclpy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/crystal/examples_rclpy_executors/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ffba45c89531e64530da37194e7b5dc5"
SRC_URI[sha256sum] = "c9d7cf286993d9694474145287a1b37acaceb6d37f2a4d7f5759adb08cb76b83"
S = "${WORKDIR}/examples-release-release-crystal-examples_rclpy_executors-0.6.3-0"

ROS_BUILD_TYPE = "ament_python"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('examples', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('examples', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/examples-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/examples/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
