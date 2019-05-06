# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The package provides the environment variables `ROS_VERSION` and `ROS_DISTRO`."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros/ros_environment"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros_environment"
ROS_BPN = "ros_environment"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros_environment-release/archive/release/dashing/ros_environment/2.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b7939bb40a28b22926423a6e9fb7370b"
SRC_URI[sha256sum] = "a83abc85b115e2a15abe169b749c10192ac22332126b723abb898c3a64143b7f"
S = "${WORKDIR}/ros_environment-release-release-dashing-ros_environment-2.3.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-environment', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-environment', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-environment/ros-environment_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-environment/ros-environment-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-environment/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-environment/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
