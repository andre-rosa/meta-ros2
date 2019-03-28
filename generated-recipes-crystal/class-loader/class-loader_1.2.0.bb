# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during runtime and the foundation of the higher level ROS &quot;pluginlib&quot; library.     class_loader utilizes the host operating system's runtime loader to open runtime libraries (e.g. .so/.dll files), introspect the library for exported plugin classes, and allows users to instantiate objects of these exported classes without the explicit declaration (i.e. header file) for those classes."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
ROS_AUTHOR = "Mirza Shah"
HOMEPAGE = "http://ros.org/wiki/class_loader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "class_loader"
ROS_BPN = "class_loader"

ROS_BUILD_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    poco \
    poco-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
    console-bridge-vendor \
    poco \
    poco-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/class_loader-release/archive/release/crystal/class_loader/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2d81eaf9b56664f55879326a49abc954"
SRC_URI[sha256sum] = "eb449f54bbf1fe37e38580e83446b523eb5891f4e187acd4fbce4ec3033c0c56"
S = "${WORKDIR}/class_loader-release-release-crystal-class_loader-1.2.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('class-loader', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('class-loader', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/class-loader/class-loader_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/class-loader/class-loader-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/class-loader/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/class-loader/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}