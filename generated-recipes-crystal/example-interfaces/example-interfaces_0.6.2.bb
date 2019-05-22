# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Contains message and service definitions used by the examples."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "example_interfaces"
ROS_BPN = "example_interfaces"

ROS_BUILD_DEPENDS = " \
    action-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/example_interfaces-release/archive/release/crystal/example_interfaces/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a24b87b4675066ab35cff5481ae99dd9"
SRC_URI[sha256sum] = "0c93953b378fdd65af4e4b68d46bb155e4dbb2ae469e8f04c9c445e3cdfb8224"
S = "${WORKDIR}/example_interfaces-release-release-crystal-example_interfaces-0.6.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('example-interfaces', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('example-interfaces', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/example-interfaces/example-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/example-interfaces/example-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/example-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/example-interfaces/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
