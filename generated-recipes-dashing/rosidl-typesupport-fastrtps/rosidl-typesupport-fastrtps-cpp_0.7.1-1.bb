# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Generate the C++ interfaces for eProsima FastRTPS."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ricardo González"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_typesupport_fastrtps"
ROS_BPN = "rosidl_typesupport_fastrtps_cpp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-cmake-module-native \
    fastrtps-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    fastcdr-native \
    fastrtps-cmake-module-native \
    fastrtps-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-parser \
    rosidl-typesupport-interface \
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

SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/dashing/rosidl_typesupport_fastrtps_cpp/0.7.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0cee6ddcb210d96c1900dea7e021d650"
SRC_URI[sha256sum] = "f3adda448b607e9e67710ad82dbb30e91ce8e9d5df285b3bf24f2d3a849f8d1e"
S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-dashing-rosidl_typesupport_fastrtps_cpp-0.7.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosidl-typesupport-fastrtps', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosidl-typesupport-fastrtps', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-fastrtps/rosidl-typesupport-fastrtps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-fastrtps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-fastrtps/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
