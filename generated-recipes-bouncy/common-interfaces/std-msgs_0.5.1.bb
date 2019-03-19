# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A package containing some standard message definitions."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "common_interfaces"
ROS_BPN = "std_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7383edaa591e6184dc719224bf6e4172"
SRC_URI[sha256sum] = "2667ca94543f46471c4350400c0eea01ed8ef13a38b04bb65a67a0fb35afafae"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_msgs-0.5.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('common-interfaces', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('common-interfaces', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/common-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/common-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-interfaces/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
