# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_implementation"
ROS_BPN = "rmw_implementation"

ROS_BUILD_DEPENDS = " \
    poco \
    poco-vendor \
    rcutils \
    rmw \
    rmw-connext-cpp \
    rmw-fastrtps-cpp \
    rmw-implementation-cmake \
    rmw-opensplice-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
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

SRC_URI = "https://github.com/ros2-gbp/rmw_implementation-release/archive/release/bouncy/rmw_implementation/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9b0b99fe49b2ef75f440699eb25841c8"
SRC_URI[sha256sum] = "fd7b8bb67e04c312a0b00ed8ba54b23ce6aea443078bd6366f21e530150d68b9"
S = "${WORKDIR}/rmw_implementation-release-release-bouncy-rmw_implementation-0.5.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rmw-implementation', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rmw-implementation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-implementation/rmw-implementation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-implementation/rmw-implementation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-implementation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-implementation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}